/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raj.genesys;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Rajkumar
 */
public class Controller {

    public Map<String, List<String>> findDeptEmployees(Map<String, List<Employee>> deptIdEmployeeList) {
      //  Map<String, List<Employee>> deptIdEmployeeList;
        //1 dept can have multiple employee
        // 1 employee can be part of multiple dept
        Map<String, List<String>> empIdDeptList;

        try {
            empIdDeptList = new HashMap();

            deptIdEmployeeList.entrySet().forEach(deptId -> {
                deptId.getValue().stream().map(emp -> {
                    if (!empIdDeptList.containsKey(emp.getEmpId())) {
                        empIdDeptList.put(emp.getEmpId(), new ArrayList());
                    }
                    return emp;
                }).forEachOrdered(emp -> {
                    empIdDeptList.get(emp.getEmpId()).add(deptId.getKey());
                });
            });
            return empIdDeptList;
        } catch (Exception e) {
        }
        return null;
    }

}
