package com.knowy.server.service;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TokenService {

	public String createPasswordResetToken(String email, Long userId) {
		// TODO - Implementar JWT
		return UUID.randomUUID().toString();
	}
}
