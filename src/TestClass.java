
public class TestClass {

    @Test(priority = 3)
    public void SomeMethodTest(){
        System.out.println("работа SomeMethodTest");
    }
    @Test(priority = 5)
    public void SomeMethodTest1(){
        System.out.println("работа SomeMethodTest1");
    }
    @Test(priority = 150)
    public void SomeMethodTest2(){
        System.out.println("работа SomeMethodTest2");
    }

    @AfterSuite
    public void SomeMethodTest6(){
        System.out.println("работа test AfterSuite");
    }
}
