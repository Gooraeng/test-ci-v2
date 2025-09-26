package com.back.domain.node.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBaseNode is a Querydsl query type for BaseNode
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBaseNode extends EntityPathBase<BaseNode> {

    private static final long serialVersionUID = 1158688642L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBaseNode baseNode = new QBaseNode("baseNode");

    public final com.back.global.baseentity.QBaseEntity _super = new com.back.global.baseentity.QBaseEntity(this);

    public final NumberPath<Integer> ageYear = createNumber("ageYear", Integer.class);

    public final StringPath altOpt1 = createString("altOpt1");

    public final NumberPath<Long> altOpt1TargetDecisionId = createNumber("altOpt1TargetDecisionId", Long.class);

    public final StringPath altOpt2 = createString("altOpt2");

    public final NumberPath<Long> altOpt2TargetDecisionId = createNumber("altOpt2TargetDecisionId", Long.class);

    public final QBaseLine baseLine;

    public final EnumPath<NodeCategory> category = createEnum("category", NodeCategory.class);

    public final ListPath<BaseNode, QBaseNode> children = this.<BaseNode, QBaseNode>createList("children", BaseNode.class, QBaseNode.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final StringPath decision = createString("decision");

    public final StringPath fixedChoice = createString("fixedChoice");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final EnumPath<NodeType> nodeKind = createEnum("nodeKind", NodeType.class);

    public final QBaseNode parent;

    public final StringPath situation = createString("situation");

    public final com.back.domain.user.entity.QUser user;

    public QBaseNode(String variable) {
        this(BaseNode.class, forVariable(variable), INITS);
    }

    public QBaseNode(Path<? extends BaseNode> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBaseNode(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBaseNode(PathMetadata metadata, PathInits inits) {
        this(BaseNode.class, metadata, inits);
    }

    public QBaseNode(Class<? extends BaseNode> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.baseLine = inits.isInitialized("baseLine") ? new QBaseLine(forProperty("baseLine"), inits.get("baseLine")) : null;
        this.parent = inits.isInitialized("parent") ? new QBaseNode(forProperty("parent"), inits.get("parent")) : null;
        this.user = inits.isInitialized("user") ? new com.back.domain.user.entity.QUser(forProperty("user")) : null;
    }

}

