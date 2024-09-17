package com.example.demo;

import com.example.demo.FileRequest;
import com.example.demo.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/files")
public class FileController {

    @Autowired
    private FileService fileService;

    // Accepting JSON body to create file
    @PostMapping("/create")
    public String createFile(@RequestBody FileRequest fileRequest) throws IOException {
        return fileService.createFile(fileRequest.getFileName(), fileRequest.getContent());
    }

    @PostMapping("/delete")
    public String deleteFile(@RequestBody FileRequest fileRequest) throws IOException {
        return fileService.deleteFile(fileRequest.getFileName());
    }

    @PostMapping("/read")
    public String read(@RequestBody FileRequest fileRequest) throws IOException {
        return fileService.readFile(fileRequest.getFileName());
    }

    @PostMapping("/update")
    public String updateFile(@RequestBody FileRequest fileRequest) throws IOException {
        return fileService.updateFile(fileRequest.getFileName(),fileRequest.getContent());
    }

}
