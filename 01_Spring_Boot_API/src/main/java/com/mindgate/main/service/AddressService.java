package com.mindgate.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindgate.main.domain.Address;
import com.mindgate.main.repository.AddressDetailsRepositoryInterface;
@Service
public class AddressService implements AddressDetailServiceInterface {
@Autowired
	private AddressDetailsRepositoryInterface addressDetailsRepository;
	@Override
	public boolean addNewAddress(Address address) {
		// TODO Auto-generated method stub
		return addressDetailsRepository.addNewAddress(address);
	}

	@Override
	public List<Address> getAllAddress() {
		// TODO Auto-generated method stub
		return addressDetailsRepository.getAllAddress();
	}

	@Override
	public boolean deleteAddress(int addressId) {
		// TODO Auto-generated method stub
		return addressDetailsRepository.deleteAddress(addressId);
	}

	@Override
	public Address getAddressByAddressId(int addressId) {
		// TODO Auto-generated method stub
		return addressDetailsRepository.getAddressByAddressId(addressId);
	}

	@Override
	public boolean updateAddress(Address address) {
		// TODO Auto-generated method stub
		return addressDetailsRepository.updateAddress(address);
	}

}
