package org.lasencinas.bombersauthentication.Model.Api;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.lasencinas.bombersauthentication.Model.Domain.Dni.Dni;

@ApiModel
@Getter
@Setter
@NoArgsConstructor
public class AuthUserDto {


    @ApiModelProperty(value = "AuthUserTests id",example = "1")
    private Long id;


    @ApiModelProperty(value = "AuthUserTests Dni",example = "dni:41533266-T")
    private DniDto dni;

    @NotNull
    @NotEmpty
    @ApiModelProperty(value = "AuthUserTests Email",example = "example@gmail.com")
    private String email;


    @NotNull
    @NotEmpty
    @ApiModelProperty(value = "AuthUserTests password",example = "ThePassword")
    private String password;
}
