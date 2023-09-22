/*
 * Copyright (c) 2022-present Charles7c Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package top.charles7c.cnadmin.system.model.request;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 重置系统参数信息
 *
 * @author Bull-BCLS
 * @since 2023/9/21 23:10
 */
@Data
@Schema(description = "重置系统参数信息")
public class ResetOptionValueRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 参数键列表
     */
    @Schema(description = "参数键列表", example = "site_title,site_copyright")
    @NotEmpty(message = "参数键不能为空")
    private List<String> code;
}