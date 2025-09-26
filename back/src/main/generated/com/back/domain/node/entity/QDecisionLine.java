package com.back.domain.node.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDecisionLine is a Querydsl query type for DecisionLine
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDecisionLine extends EntityPathBase<DecisionLine> {

    private static final long serialVersionUID = 596098431L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDecisionLine decisionLine = new QDecisionLine("decisionLine");

    public final com.back.global.baseentity.QBaseEntity _super = new com.back.global.baseentity.QBaseEntity(this);

    public final QBaseLine baseLine;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final ListPath<DecisionNode, QDecisionNode> decisionNodes = this.<DecisionNode, QDecisionNode>createList("decisionNodes", DecisionNode.class, QDecisionNode.class, PathInits.DIRECT2);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final EnumPath<DecisionLineStatus> status = createEnum("status", DecisionLineStatus.class);

    public final com.back.domain.user.entity.QUser user;

    public QDecisionLine(String variable) {
        this(DecisionLine.class, forVariable(variable), INITS);
    }

    public QDecisionLine(Path<? extends DecisionLine> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDecisionLine(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDecisionLine(PathMetadata metadata, PathInits inits) {
        this(DecisionLine.class, metadata, inits);
    }

    public QDecisionLine(Class<? extends DecisionLine> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.baseLine = inits.isInitialized("baseLine") ? new QBaseLine(forProperty("baseLine"), inits.get("baseLine")) : null;
        this.user = inits.isInitialized("user") ? new com.back.domain.user.entity.QUser(forProperty("user")) : null;
    }

}

