package org.hj.chatroomserver.model.vo;

import lombok.Data;
import org.hj.chatroomserver.model.enums.ContextType;

import java.util.Date;

/**
 * @see org.hj.chatroomserver.model.entity.Message
 * @see org.hj.chatroomserver.model.entity.User
 */
@Data
public class MessageVo {

    private Integer messageId;

    private Integer ownerId;

    private String content;

    private ContextType contextType;

    private Date createTime;

    private Date updateTime;

    private String avatar;

    private String username;
}
