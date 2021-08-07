package com.techlab.model;

public class CompressionHandler extends HttpRequestChecker{

	@Override
	public void check(HttpRequestDTO dto) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Checking Compression");
		this.checkNext(dto);
	}

}
