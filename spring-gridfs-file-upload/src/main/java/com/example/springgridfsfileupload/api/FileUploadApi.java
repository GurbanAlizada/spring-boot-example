package com.example.springgridfsfileupload.api;

import com.example.springgridfsfileupload.service.FileUploadService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/upload")
public class FileUploadApi {

    private final FileUploadService fileUploadService;

    public FileUploadApi(FileUploadService fileUploadService) {
        this.fileUploadService = fileUploadService;
    }


    @PostMapping
    public void fileUpload(@RequestParam MultipartFile file) throws Exception {
        fileUploadService.uploadFile(file);
    }



}