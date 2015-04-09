package com.nowhereapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nowhereapp.dao.DataDao;
import com.nowhereapp.domain.Employee;
@Service
@Transactional
public class DataServiceImpl implements DataService {
	
	@Autowired
	DataDao dataDao;

	@Override
	@Transactional
	public int insertRow(Employee employee) {
		return dataDao.insertRow(employee);
	}

	@Override
	@Transactional
	public List<Employee> getList() {
		return dataDao.getList();
	}

	@Override
	@Transactional
	public Employee getRowById(int id) {
		return dataDao.getRowById(id);
	}

	@Override
	@Transactional
	public int updateRow(Employee employee) {
		return dataDao.updateRow(employee);
	}

	@Override
	@Transactional
	public int deleteRow(int id) {
		return dataDao.deleteRow(id);
	}

}
