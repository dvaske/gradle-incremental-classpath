package com.company;

import com.example.PostingType;

public class Company {
	private CompanyImpl cIpl;

	Company(CompanyImpl companyImpl){
		cIpl = companyImpl;
	}
	
	public int example(PostingType postingType) {
		if (postingType == PostingType._a_0)
			return 1;
		if (postingType == PostingType._a_1)
			return 2;
		return 0;
	}
}
