package aa14f.model.business.justizia;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;
import r01f.enums.EnumWithCode;
import r01f.enums.EnumWithCodeWrapper;

@Accessors(prefix="_")
@RequiredArgsConstructor(access=AccessLevel.PRIVATE)
public enum AA14JustiziaActor
 implements EnumWithCode<Integer,AA14JustiziaActor> {
	ABOGADO(1),
	PROCURADOR(2),
	GRADUADO_SOCIAL(3),
	CIUDADANIA(4),
	OTRO(5);
	
	@Getter private final Integer _code;
	@Getter private final Class<Integer> _codeType = Integer.class;
/////////////////////////////////////////////////////////////////////////////////////////
//  
/////////////////////////////////////////////////////////////////////////////////////////
	private static final EnumWithCodeWrapper<Integer,AA14JustiziaActor> WRAPPER = EnumWithCodeWrapper.wrapEnumWithCode(AA14JustiziaActor.class);
	
	@Override
	public boolean isIn(final AA14JustiziaActor... els) {
		return WRAPPER.isIn(this,els);
	}
	@Override
	public boolean is(final AA14JustiziaActor el) {
		return WRAPPER.is(this,el);
	}
	
	public static AA14JustiziaActor createFrom(final String val) {
		return WRAPPER.fromCode(Integer.parseInt(val));
	}
}
