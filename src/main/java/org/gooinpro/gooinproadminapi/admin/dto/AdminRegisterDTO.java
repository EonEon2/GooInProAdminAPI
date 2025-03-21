package org.gooinpro.gooinproadminapi.admin.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdminRegisterDTO {

    private String admid;
    private String admpw;
    private String admname;
    private String admrole;
}
