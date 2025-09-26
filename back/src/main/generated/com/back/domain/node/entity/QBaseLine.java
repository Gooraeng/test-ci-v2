package com.back.domain.node.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBaseLine is a Querydsl query type for BaseLine
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBaseLine extends EntityPathBase<BaseLine> {

    private static final long serialVersionUID = 1158623604L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBaseLine baseLine = new QBaseLine("baseLine");

    public final com.back.global.baseentity.QBaseEntity _super = new com.back.global.baseentity.QBaseEntity(this);

    public final ListPath<BaseNode, QBaseNode> baseNodes = this.<BaseNode, QBaseNode>createList("baseNodes", BaseNode.class, QBaseNode.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath title = createString("title");

    public final com.back.domain.user.entity.QUser user;

    public QBaseLine(String variable) {
        this(BaseLine.class, forVariable(variable), INITS);
    }

    public QBaseLine(Path<? extends BaseLine> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBaseLine(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBaseLine(PathMetadata metadata, PathInits inits) {
        this(BaseLine.class, metadata, inits);
    }

    public QBaseLine(Class<? extends BaseLine> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.user = inits.isInitialized("user") ? new com.back.domain.user.entity.QUser(forProperty("user")) : null;
    }

}

