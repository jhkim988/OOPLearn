package head_first_design_pattern.ch11proxy.dating;

import java.lang.reflect.Proxy;

public class MatchMakingTestDrive {
    public static void main(String[] args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }

    public MatchMakingTestDrive() {
        // initilizeDatabase();
    }

    public void drive() {
        Person kim = getPersonFromDatabase("김자바");
        Person joe = getPersonFromDatabase("JOE");
        
        Person ownerProxy = getOwnerProxy(kim);
        System.out.println("이름: " + ownerProxy.getName());
        System.out.println("본인 프록시에 관심 사항을 등록합니다.");
        try {
            ownerProxy.setGeekRating(10);
        } catch (Exception e) {
            System.out.println("본인 프록시에는 괴짜 지수를 매길 수 없습니다.");
        }

        System.out.println("괴짜 지수: " + ownerProxy.getGeekRating());

        Person nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("이름: " + nonOwnerProxy.getName());
        
        try {
            nonOwnerProxy.setInterests("볼링, 바둑");
        } catch (Exception e) {
            System.out.println("타인 프록시에는 관심 사항을 등록할 수 없습니다.");
        }

        nonOwnerProxy.setGeekRating(3);
        System.out.println("타인 프록시에 괴짜 지수를 매깁니다.");
        System.out.println("괴짜 지수: " + nonOwnerProxy.getGeekRating());
    }

    public Person getPersonFromDatabase(String name) {
        return new PersonImpl();
    }

    public Person getOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(person.getClass().getClassLoader()
        , person.getClass().getInterfaces()
        , new OwnerInvocationHandler(person));
    }

    public Person getNonOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(
            person.getClass().getClassLoader()
            , person.getClass().getInterfaces()
            , new NonOwnerInvocationHandler(person));
    }
}
