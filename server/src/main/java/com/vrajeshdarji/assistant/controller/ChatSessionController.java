package com.vrajeshdarji.assistant.controller;

import com.vrajeshdarji.assistant.dto.ChatMessageResponse;
import com.vrajeshdarji.assistant.dto.ChatSessionResponse;
import com.vrajeshdarji.assistant.dto.ChatSessionSummary;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/sessions")
@AllArgsConstructor
public class ChatSessionController {

    private final ChatSessionService sessionService;

    @GetMapping
    public List<ChatSessionSummary> getAllChatSessions() {
           try{
               return sessionService.getAllSession();
           }catch(Exception e) {
                throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Session could not be found");
           }
    }

    @GetMapping("/{sessionId}")
    public List<ChatMessageResponse> getMessages(@PathVariable String sessionId) {
        try{
            return sessionService.getMessages(sessionId);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Messages could not be loaded");
        }
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ChatSessionResponse createSession() {
        try{
            return sessionService.createSession();
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Session could not be created");
        }
    }

    @PatchMapping("/{sessionId}")
    public ChatSessionSummary renameSession(@PathVariable String sessionId,@RequestBody String newTitle) {
        try{
            sessionService.renameSession(sessionId, newTitle);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Session could not be renamed");
        }
    }

    @DeleteMapping("/{sessionId")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteSession(@PathVariable String sessionId) {
        try{
            sessionService.deleteSession(sessionId);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Session could not be deleted");
        }
    }
}
