package com.yogesh.mathematic.mainmethod;

import com.yogesh.mathematic.blogic.additive.Addition;
import com.yogesh.mathematic.blogic.additive.Subtraction;
import com.yogesh.mathematic.blogic.multiplicative.Division;
import com.yogesh.mathematic.blogic.multiplicative.Multiplication;

public class Calculator 
{
	public static void main(String[] args) 
	{
		Addition.add(10,20);
		Subtraction.sub(20,10);
		Division.div(10,5);
		Multiplication.mul(10,20);
		
	}
}
