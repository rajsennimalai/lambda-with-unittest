/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raj.genesys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author Rajkumar
 */
public class ControllerTest {

    public ControllerTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

    /**
     * Test of findDeptEmployees method, of class Controller.
     */
    @org.junit.jupiter.api.Test
    public void testFindDeptEmployees() {
        System.out.println("findDeptEmployees");
        Map<String, List<Employee>> deptIdEmployeeList = new HashMap();
        Department dep1 = new Department();
        dep1.setDeptId("dep1");
        dep1.setDeptName("Dep 1");

        Department dep2 = new Department();
        dep2.setDeptId("dep2");
        dep2.setDeptName("Dep 2");

        Employee emp1 = new Employee();
        emp1.setEmpId("emp1");
        emp1.setEmpName("Emp 1");

        Employee emp2 = new Employee();
        emp2.setEmpId("emp2");
        emp2.setEmpName("Emp 2");

        List<Employee> dep1Employee = new ArrayList();
        dep1Employee.add(emp1);

        List<Employee> dep2Employee = new ArrayList();
        dep2Employee.add(emp1);
        dep2Employee.add(emp2);

        deptIdEmployeeList.put("dep1", dep1Employee);
        deptIdEmployeeList.put("dep2", dep2Employee);
        
        Controller controller = new Controller();
        Map<String, List<String>> expResult = new HashMap();
        List emp1Dept=Arrays.asList("dep1","dep2");
        List emp2Dept=Arrays.asList("dep2");
        expResult.put("emp1", emp1Dept);
        expResult.put("emp2", emp2Dept);
        Map<String, List<String>> result = controller.findDeptEmployees(deptIdEmployeeList);
        assertEquals(expResult, result);
      
    }

}
