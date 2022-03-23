package com.project.SportyShoes.controller;




 ProductServlet {
	@Autowired
	public ProductService prodserv;
	
	@RequestMapping("/listprod")
	public String viewListProductPage(Model model)
	{
		List<Product>listProduct= prodserv.listAll();
		model.addAttribute("listProduct", listProduct);
		return"product_manage";
		
	}
	
	@RequestMapping("/newproduct")
	public String addNewProductPage(Model model)
	{
		Product product= newProduct();
		model.addAttribute("product", product);
		
		return"new_product";
	}
	
	@RequestMapping(value = "/saveproduct", method = RequestMethod.POST)
	public String saveCategory(@ModelAttribute("product") Product product, Model md) 
	{   
		
		prodserv.save(product);
		List<Product>listProduct= prodserv.listAll();
		md.addAttribute("listProduct", listProduct);
		
		return"product_manage";
	
	}
	

}

