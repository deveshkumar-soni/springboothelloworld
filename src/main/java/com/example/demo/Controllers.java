package com.example.demo;
import org.springframework.web.bind.annotation.*;
@RestController
public class Controllers{
	 private final String CONTEXT = "/api/v1/example";
	    @GetMapping(value = CONTEXT)
	    public String greeting(
	            @RequestParam(required = true, defaultValue = "Unknown") String name,
	            @RequestParam(required = false) String number) {
	        if(number == null){
	            return "Example content for " + name;
	        }
	        int num=0 ;
	        try {
	        	num = Integer.parseInt(number);
	        }catch(Exception ex) {}
	        return "Example content for " + name + " with number " + (num + 3);
	    }  
	    @GetMapping(value="HellWorld")
	    public String HelloWorld(@RequestParam(name = "c",required = false) String cname) {
	    	String r="HelloWorld";
	    	if(cname!=null) {
	    		r=r+"-------"+cname ;
	    	}
	    	
	    	return r;
	    	
	    }
      
	    @GetMapping(value="Home") 
	    public String Index(String cname) {
	    	String r="HelloWorld";
	    	if(cname!=null) {
	    		r=r+"-------"+cname ;
	    	}
	    	
	    	return r;
	    	
	    }
	    
}