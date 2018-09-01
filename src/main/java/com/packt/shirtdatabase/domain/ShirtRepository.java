package com.packt.shirtdatabase.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

//import java.util.Date;
import java.util.List;

public interface ShirtRepository extends PagingAndSortingRepository<Shirt, Long> {

	//fetch Shirts by type, sortBy number of colors
	List<Shirt> findByShirtTypeOrderByColorCount(String shirtType);

	//fetch shirt orders that are open, orderBy DueDate DESC
	//List<Shirt> findByIdSortByDueDateDesc(long Id);

	//fetch shirts by shirtType and shirtColor
	List<Shirt> findByShirtTypeAndShirtColor(String shirtType, String shirtColor);

	//fetch shirts by shirtType || shirtColor
	List<Shirt> findByShirtTypeOrShirtColor(String shirtType, String shirtColor);

	//fetch Shirts by shirtColor
	List<Shirt> findByShirtColor(String shirtColor);

	//fetch Shirts by colorCount
	List<Shirt> findByColorCount(int colorCount);



}
