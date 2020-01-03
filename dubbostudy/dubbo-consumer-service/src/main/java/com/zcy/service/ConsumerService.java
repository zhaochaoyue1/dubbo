package com.zcy.service;

import com.zcy.User;
import org.springframework.stereotype.Component;

@Component
public interface ConsumerService {
    User getUserService(Long userId);
}
