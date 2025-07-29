package com.vintageclothes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VintageClothesController {

	@GetMapping("/")
    public String home() {
        return "index";  // templates/home/index.html
    }

	/**
	 * 별별구제
	 * 오정수
	 * 010-7654-0327
	 * @return
	 */
    @GetMapping("/01")
    public String user_01() {
        return "01/index";  // templates/01/index.html
    }
    
    /**
     * 
     * 
     * 
     * @return
     */
    @GetMapping("/02")
    public String user_02() {
    	return "02/index";  // templates/02/index.html
    }
    
    /**
     * 
     * 
     * 
     * @return
     */
    @GetMapping("/03")
    public String user_03() {
    	return "03/index";  // templates/03/index.html
    }
    
    /**
     * 
     * 
     * 
     * @return
     */
    @GetMapping("/04")
    public String user_04() {
    	return "04/index";  // templates/04/index.html
    }
    
    /**
     * 
     * 
     * 
     * @return
     */
    @GetMapping("/05")
    public String user_05() {
    	return "05/index";  // templates/05/index.html
    }
    
    /**
     * 
     * 
     * 
     * @return
     */
    @GetMapping("/06")
    public String user_06() {
    	return "06/index";  // templates/06/index.html
    }
    
    /**
     * 
     * 
     * 
     * @return
     */
    @GetMapping("/07")
    public String user_07() {
    	return "07/index";  // templates/07/index.html
    }
    
    /**
     * 
     * 
     * 
     * @return
     */
    @GetMapping("/08")
    public String user_08() {
    	return "08/index";  // templates/08/index.html
    }
    
    /**
     * 
     * 
     * 
     * @return
     */
    @GetMapping("/09")
    public String user_09() {
    	return "09/index";  // templates/09/index.html
    }
    
    /**
     * 
     * 
     * 
     * @return
     */
    @GetMapping("/10")
    public String user_10() {
    	return "10/index";  // templates/10/index.html
    }
    
}
