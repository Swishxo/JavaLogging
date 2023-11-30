import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void addEqualsTen(){
        var cal = new calc();
        assertEquals(10, cal.add(5,5));
    }

    @org.junit.jupiter.api.Test
    void subEqualsSix(){
        var cal = new calc();
        assertEquals(50, cal.sub(100,50));
    }
}