package com.bridgelabz.springannotations;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
/**************************************************************************************
 * @author 	:Pramila Tawari
 * Purpose	:Maharshtra Government implementing Government
 * Date		:31/12/2019
 *
 **************************************************************************************/
@SuppressWarnings("unused")
@Component
// @Primary    // It is for indicating the particulat class whose object you want
public class MaharshtraGov implements Government
{
	public void process() {
		System.out.println("Maharshtra Government");
		
	}
}
