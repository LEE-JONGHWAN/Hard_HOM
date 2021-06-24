package com.jhlee.hardshop.store;

import java.util.Comparator;


public class CompareHardCustEval implements Comparator<HardProduct> {
	@Override
	public int compare(HardProduct tea1, HardProduct tea2) {
		return Float.compare(tea2.get고객평점(), tea1.get고객평점());
	}

}
