package com.bridgelabz.springannotations;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
/**************************************************************************************
 * @author 	:Pramila Tawari
 * Purpose	:News Channel implementing Government
 * Date		:31/12/2019
 *
 **************************************************************************************/
@SuppressWarnings("unused")
@Component
public class NewsChannels implements Government {

	public void process() {
		System.out.println("NEWS18,AAJ-TAK");
	}
}
