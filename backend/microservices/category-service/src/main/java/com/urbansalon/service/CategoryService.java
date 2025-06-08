package com.urbansalon.service;

import com.urbansalon.dto.SalonDTO;
import com.urbansalon.modal.Category;

import java.util.Set;

public interface CategoryService {
    Category saveCategory(Category category, SalonDTO salonDTO);
    Set<Category> getAllCategoriesBySalon(Long id);
    Category getCategoryById(Long id) throws Exception;
    void deleteCategoryById(Long id) throws Exception;
}
