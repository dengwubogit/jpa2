package cc.wubo.jpa.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QNativeQuery_ext_Phone4 is a Querydsl query type for NativeQuery_ext_Phone4
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QNativeQuery_ext_Phone4 extends EntityPathBase<NativeQuery_ext_Phone4> {

    private static final long serialVersionUID = 1566250517L;

    public static final QNativeQuery_ext_Phone4 nativeQuery_ext_Phone4 = new QNativeQuery_ext_Phone4("nativeQuery_ext_Phone4");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath username = createString("username");

    public QNativeQuery_ext_Phone4(String variable) {
        super(NativeQuery_ext_Phone4.class, forVariable(variable));
    }

    public QNativeQuery_ext_Phone4(Path<? extends NativeQuery_ext_Phone4> path) {
        super(path.getType(), path.getMetadata());
    }

    public QNativeQuery_ext_Phone4(PathMetadata metadata) {
        super(NativeQuery_ext_Phone4.class, metadata);
    }

}

