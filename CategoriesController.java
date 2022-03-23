package com.project.SportyShoes.controller;

import java.awt.image.ColorModel;

import javax.swing.ListModel;

public class CategoriesController<CategoriesService> {
	
	private CategoriesService catserv;
	private ListModel model;
	
	public String viewListPage(ColorModel model)
	{
		this.model = (ListModel) model;
		Object listCategories;
		//List<Categories> listCategories= ((Object) catserv).listAll();
		//model.addAttribute("listCategories", listCategories);
		return "manage";
	}

	public String addNewCatPage(ColorModel model)
	{
		Categories categories= new Categories();
		model.addAttribute("categories", categories);
		return "new_category";
   
		catserv.save(categories);
		List<Categories> listCategories= catserv.listAll();
		m.addAttribute("listCategories", listCategories);
	return "manage";
	}	

	
	public String deleteCategory(@PathVariable(name ="id") long id, Model m)
	{
		
		return "manage";
	}
	}
