package com.techlab.model;

public abstract class HttpRequestChecker {
	private HttpRequestChecker next;

	public void setNext(HttpRequestChecker next) {
		this.next = next;
	}

	public abstract void check(HttpRequestDTO dto) throws Exception;

	protected void checkNext(HttpRequestDTO dto) throws Exception {
		if (next != null) {
			next.check(dto);
		}
	}
}
