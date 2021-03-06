/**
 * Copyright (c) 2018-2019, Jie Li 李杰 (mqgnsds@163.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.momo.common.core.error;

/**
 * @ClassName: ServiceException
 * @Author: Jie Li
 * @Date 2019-11-14 15:41
 * @Description: 服务错误
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2019</p>
 **/
public class ServiceException extends RuntimeException {
    private Integer errorCode;
    private String errorMessage;

    public ServiceException(ErrorEnum errorEnum) {
        this.errorCode = errorEnum.getErrorCode();
        this.errorMessage = errorEnum.getErrorMessage();
    }

    public ServiceException(ErrorEnum errorEnum, String errorMessage) {
        this.errorCode = errorEnum.getErrorCode();
        this.errorMessage = errorMessage;
    }

    public ServiceException(Integer errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
