package com.operations;
import java.util.*;

import com.connections.DbConnection;
import com.entities.Employee;

import java.sql.*;
public class EmpOperations {

	private Connection conObj;
	private PreparedStatement ps;
	
	public EmpOperations()
	{
		conObj = DbConnection.getConnection();
	}
	
	public int AddEmployee(Employee emp)
	{
		int res = -1;
		try {
			ps = conObj.prepareStatement("Insert into Employee(empname, job, salary, email, pswd) values(?,?,?,?,?)");
			ps.setString(1, emp.getEmpname());
			ps.setString(2, emp.getJob());
			ps.setInt(3, emp.getSalary());
			ps.setString(4, emp.getEmail());
			ps.setString(5, emp.getPswd());
			
			res = ps.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return res;
	}
	
	public List<Employee>  ShowAllEmps()
	{
		List<Employee> emplist = new ArrayList<Employee>();
		Employee  emp = null;
		try {
			ps = conObj.prepareStatement("select * from employee");
			ResultSet  rs = ps.executeQuery();
			while(rs.next())
			{
				emp = new Employee();
				emp.setEmpno(rs.getInt("empno"));
				emp.setEmpname(rs.getString("empname"));
				emp.setSalary(rs.getInt("salary"));
				emp.setJob(rs.getString("job"));
				emp.setEmail(rs.getString("email"));
				emp.setPswd(rs.getString("pswd"));
				emplist.add(emp);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return emplist;
	}

	public Employee SearchEmployee(int eno)
	{
		
		Employee  emp = null;
		try {
			ps = conObj.prepareStatement("select * from employee where empno=?");
			ps.setInt(1, eno);
			ResultSet  rs = ps.executeQuery();
			if(rs.next())
			{
				emp = new Employee();
				emp.setEmpno(rs.getInt("empno"));
				emp.setEmpname(rs.getString("empname"));
				emp.setSalary(rs.getInt("salary"));
				emp.setJob(rs.getString("job"));
				emp.setEmail(rs.getString("email"));
				emp.setPswd(rs.getString("pswd"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return emp;
	}
	
	public Employee UserCheck(String email, String pwd)
	{
		Employee  emp = null;
		try {
			ps = conObj.prepareStatement("select * from employee where email=? and pswd=?");
			ps.setString(1, email);
			ps.setString(2, pwd);
			ResultSet  rs = ps.executeQuery();
			if(rs.next())
			{
				emp = new Employee();
				emp.setEmpno(rs.getInt("empno"));
				emp.setEmpname(rs.getString("empname"));
				emp.setSalary(rs.getInt("salary"));
				emp.setJob(rs.getString("job"));
				emp.setEmail(rs.getString("email"));
				emp.setPswd(rs.getString("pswd"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return emp;
	}
	
	public int ChangePwd(String npwd, int eno)
	{
		int res = -1;
		try {
			ps = conObj.prepareStatement("Update Employee set pswd=? where empno=?");
			ps.setString(1, npwd);
			ps.setInt(2, eno);
			res = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return res;
	}
	
	public void DeleteEmp(int eno)
	{
		try {
			ps = conObj.prepareStatement("Delete from Employee where empno=?");
			ps.setInt(1, eno);
			int res = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
