package com.example.demo;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.*;

@Service
public class FileService {

    private final String folderPath = "files"; // Folder to save files

    public FileService() throws IOException {
        // Create the directory if it doesn't exist
        Files.createDirectories(Paths.get(folderPath));
    }

    public String createFile(String fileName, String content) throws IOException {
        Path filePath = Paths.get(folderPath, fileName);
        Files.write(filePath, content.getBytes(), StandardOpenOption.CREATE);
        return "File created: " + fileName;
    }

    public String deleteFile(String fileName) throws IOException{
        Path filePath = Paths.get(folderPath, fileName);
        Files.delete(filePath);
        return "File deleted: " + fileName;
    }

    public String readFile(String fileName) throws IOException{
        Path filePath = Paths.get(folderPath, fileName);
        String str = String.valueOf(Files.readAllLines(filePath));
        return "File read: " + str;
    }

    public String updateFile(String fileName, String content) throws IOException {
        Path filePath = Paths.get(folderPath, fileName);
        System.out.println(content.getBytes());
        String s = String.valueOf(Files.write(filePath,content.getBytes(), StandardOpenOption.TRUNCATE_EXISTING));
        return "updated file:" + s;
    }
}
