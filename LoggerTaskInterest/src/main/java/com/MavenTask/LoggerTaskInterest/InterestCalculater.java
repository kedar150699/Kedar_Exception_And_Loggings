package com.MavenTask.LoggerTaskInterest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InterestCalculater 
{
	private static final Logger LOGGER = LogManager.getLogger(InterestCalculater.class);
	// All static variables are used in this program
	static int timePeriod,principal,rateOfInterest,numberOfTimeInterest;
	float simple(int principal,int timePeriod,int rateOfInterest)
	{
		float simpleInterest=(principal*timePeriod*rateOfInterest)/100;
		return simpleInterest;
	}
	double compond(int principal,int timePeriod,int rateOfInterest,int numberOfTimeInterest) 
	{
		float Answer = 1+(rateOfInterest/numberOfTimeInterest);
		float storeValue = numberOfTimeInterest*timePeriod;
		double powerCalculate = Math.pow(Answer,storeValue);
		double compoundInterest = principal*powerCalculate;
		return compoundInterest;
	}

	public static void main(String args[])
	{
			InterestCalculater objectForClass=new InterestCalculater();
			principal=2020;
			timePeriod=3;
			rateOfInterest=2;
			numberOfTimeInterest=6;
			LOGGER.info("Simple Interest & Compound Interest");
			LOGGER.info(objectForClass.simple(principal,timePeriod,rateOfInterest));
			LOGGER.info(objectForClass.compond(principal,timePeriod,rateOfInterest,numberOfTimeInterest));
			principal=3400;
			timePeriod=3;
			rateOfInterest=4;
			numberOfTimeInterest=2;
			LOGGER.info("Simple Interest & Compound Interest");
			LOGGER.info(objectForClass.simple(principal,timePeriod,rateOfInterest));
			LOGGER.info(objectForClass.compond(principal,timePeriod,rateOfInterest,numberOfTimeInterest));
			principal=2500;
			timePeriod=3;
			rateOfInterest=3;
			numberOfTimeInterest=4;
			LOGGER.info("Simple Interest & Compound Interest");
			LOGGER.info(objectForClass.simple(principal,timePeriod,rateOfInterest));
			LOGGER.info(objectForClass.compond(principal,timePeriod,rateOfInterest,numberOfTimeInterest));
			principal=3050;
			timePeriod=11;
			rateOfInterest=5;
			numberOfTimeInterest=6;
			LOGGER.info("Simple Interest & Compound Interest");
			LOGGER.info(objectForClass.simple(principal,timePeriod,rateOfInterest));
			LOGGER.info(objectForClass.compond(principal,timePeriod,rateOfInterest,numberOfTimeInterest));
	}
}
