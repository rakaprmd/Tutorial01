package com.example.demo.controller;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {
	 @RequestMapping("/viral")
	 public String index() {
		 return "viral";
		 
	 }
//	 @RequestMapping("challenge")
//	 public String challenge(@RequestParam(value = "name", required = false,defaultValue = "raka")String name, Model model) {
//		 model.addAttribute("name",name);
//		 return "challenge";
//	 }
	 
	 
//	 @RequestMapping(value = {"/challenge","/challenge/{name}"})
//	 public String challengePath(@PathVariable Optional<String> name, Model model) {
//		if (name.isPresent()) {
//			 model.addAttribute("name", name.get());
//		}
//		else {
//			 model.addAttribute("name","KB" );
//
//		}
//		 return "challenge";
	@RequestMapping("/generator")
	public String challenge(@RequestParam(value="a",required=false) Integer a, @RequestParam(value="b", required=false) Integer b, Model model) {
		  if (a == null) {
		   a=0;
		  }
		  if (b == null) {
		   b=0;
		  }
		  String hm = "";
		  String temp = "h";
		  
		  if (a > 1) {
		   for (int i = 0; i < a; i++) 
		   {temp += "m";} 
		  }
		  else {
		   temp += "m";
		  }
		  
		  if (b > 1) {
		   for (int i = 0; i < b; i++) 
		   {hm += " " + temp;}
		  }
		  else {
		   hm = temp;
		  }
		  model.addAttribute("a", a);
		  model.addAttribute("b", b);
		  model.addAttribute("hm", hm);
		  //html name routing
		  return "generator";
		 }
	 }

		
	 
	 


