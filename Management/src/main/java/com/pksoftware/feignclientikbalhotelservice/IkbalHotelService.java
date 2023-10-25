package com.pksoftware.feignclientikbalhotelservice;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.pksoftware.entity.IkbalHotel;


@FeignClient(url="http://localhost:8192", value="IkbalHote")
public interface IkbalHotelService {

		 @PostMapping("/ikemployee")
		 IkbalHotel insertIkbalHotelData(@RequestBody IkbalHotel hotel);
		 
		 @PutMapping("/ikemployee")
		 IkbalHotel updateIkbalHotelData(@RequestBody IkbalHotel hotel);
		 
		 @DeleteMapping("/ikemployee/{id}")
		 void deleteIkbalHotelData(@PathVariable int id);
		 
		 @GetMapping("/ikemployee")
		 List<IkbalHotel> getAllDataIkbalHotelEmployee();
		 
		 @GetMapping("/ikemployee/{id}")
		 IkbalHotel getByIdIkbalHotelEmployee(@PathVariable int id);
		 
}
