package common.entity;

import lombok.Data;

/**
 * @description:
 * @author: zhangp
 * @date: 2020-08-04 18:20
 */
@Data
public class RestfulResult {
    private String result = "Success";
    private String message;
    private Object data;		// 返回数据
    private int cntPage;		// page数
    private long cntData;		// 返回数据总数
}
