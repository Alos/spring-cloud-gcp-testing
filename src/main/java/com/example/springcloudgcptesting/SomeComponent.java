package com.example.springcloudgcptesting;

import com.google.cloud.spring.core.DefaultCredentialsProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SomeComponent {
  private final DefaultCredentialsProvider defaultCredentialsProvider;
}
