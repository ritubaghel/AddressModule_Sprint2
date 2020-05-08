package com.capgemini.go.service;
import java.util.List;

import com.capgemini.go.entities.AddressDto;

public interface IAddressService {

	boolean deleteAddress(AddressDto addressDTO);
	boolean updateAddress(AddressDto addressDTO);
	boolean addAddress(AddressDto addressDTO);
    List<AddressDto>viewAllAddress(String addressId);
    AddressDto findById(String addressId);
		
	
}
