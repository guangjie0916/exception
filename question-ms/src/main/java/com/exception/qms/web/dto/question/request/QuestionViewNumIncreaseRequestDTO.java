package com.exception.qms.web.dto.question.request;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author jiangbing(江冰)
 * @date 2018/4/10
 * @time 下午7:59
 * @discription
 **/
@Data
public class QuestionViewNumIncreaseRequestDTO implements Serializable {
    @NotNull
    private Long questionId;
}
