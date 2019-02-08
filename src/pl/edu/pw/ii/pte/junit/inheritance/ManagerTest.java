package pl.edu.pw.ii.pte.junit.inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;
    Employee employee;

    @Before
    public void setUp() throws Exception {
        manager = new Manager("Alan", 11111, 1999, 12, 11);
        employee = new Employee("Brian", 1000, 1998, 10, 9);
    }

    @Test
    public void testGetSalary(){
        manager.setBonus(111.00);
        assertEquals(11222.0, manager.getSalary(), 0);
        assertEquals(1000, employee.getSalary(), 0);
    }
    @Test
    public void testGetName(){
        assertEquals("Alan", manager.getName());
        assertEquals("Brian", employee.getName());
    }
    @Test
    public void testGetHireDay(){
        String date = "Sat Dec 11 00:00:00 CET 1999";
        String date1 = "Fri Oct 09 00:00:00 CEST 1998";
        assertEquals(date, manager.getHireDay().toString());
        assertEquals(date1, employee.getHireDay().toString());
    }
    @Test
    public void testRaiseSalary(){
        manager.raiseSalary(12.00);
        employee.raiseSalary(5);
        assertEquals(12444.32, manager.getSalary(), 0);
        assertEquals(1050, employee.getSalary(), 0);
    }
}
