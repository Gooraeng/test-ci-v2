package com.back.domain.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.Bucket;

import java.util.List;
import java.util.Optional;

@RestController
public class HomeController {

    private final Optional<S3Client> s3Client;

    public HomeController(@Autowired(required = false) S3Client s3Client) {
        this.s3Client = Optional.ofNullable(s3Client);
    }

    @GetMapping("/buckets")
    public List<String> buckets() {
        return s3Client
                .map(client -> client.listBuckets()
                        .buckets()
                        .stream()
                        .map(Bucket::name)
                        .toList())
                .orElse(List.of("S3 client not available"));
    }
//
//    @PostMapping("/upload")
//    public ResponseEntity<String> upload() {
//
//        return s3Client.putObject(
//                PutObjectRequest.builder()
//                        .bucket()
//                        .build()
//        )
//    }
}
