package com.patrick.whatsappclone.message;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MessageRequest {
    private String content;
    private String senderId;
    private String receiverId;
    private MessageType type;
    private String chatId;
}
