package com.example.algafood.qualifiers;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.beans.factory.annotation.Qualifier;

@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface TipoDoQualificador {

	NivelUrgencia value();

}
