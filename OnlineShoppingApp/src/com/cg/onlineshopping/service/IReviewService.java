package com.cg.onlineshopping.service;

import java.util.List;

import com.cg.onlineshopping.entities.Review;

public interface IReviewService {

	public Review addReview();
	public boolean deleteReview(int id);
	public Review updateReview(int id);
	
	public List<Review> getAllReviewByProduct(int productId);
	
	// business operation methods
	
}
