package com.back.domain.node.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDecisionNode is a Querydsl query type for DecisionNode
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDecisionNode extends EntityPathBase<DecisionNode> {

    private static final long serialVersionUID = 596163469L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDecisionNode decisionNode = new QDecisionNode("decisionNode");

    public final com.back.global.baseentity.QBaseEntity _super = new com.back.global.baseentity.QBaseEntity(this);

    public final NumberPath<Integer> ageYear = createNumber("ageYear", Integer.class);

    public final StringPath background = createString("background");

    public final QBaseNode baseNode;

    public final EnumPath<NodeCategory> category = createEnum("category", NodeCategory.class);

    public final ListPath<DecisionNode, QDecisionNode> children = this.<DecisionNode, QDecisionNode>createList("children", DecisionNode.class, QDecisionNode.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final StringPath decision = createString("decision");

    public final QDecisionLine decisionLine;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final EnumPath<NodeType> nodeKind = createEnum("nodeKind", NodeType.class);

    public final StringPath option1 = createString("option1");

    public final StringPath option2 = createString("option2");

    public final StringPath option3 = createString("option3");

    public final QDecisionNode parent;

    public final NumberPath<Integer> parentOptionIndex = createNumber("parentOptionIndex", Integer.class);

    public final NumberPath<Integer> selectedIndex = createNumber("selectedIndex", Integer.class);

    public final StringPath situation = createString("situation");

    public final com.back.domain.user.entity.QUser user;

    public QDecisionNode(String variable) {
        this(DecisionNode.class, forVariable(variable), INITS);
    }

    public QDecisionNode(Path<? extends DecisionNode> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDecisionNode(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDecisionNode(PathMetadata metadata, PathInits inits) {
        this(DecisionNode.class, metadata, inits);
    }

    public QDecisionNode(Class<? extends DecisionNode> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.baseNode = inits.isInitialized("baseNode") ? new QBaseNode(forProperty("baseNode"), inits.get("baseNode")) : null;
        this.decisionLine = inits.isInitialized("decisionLine") ? new QDecisionLine(forProperty("decisionLine"), inits.get("decisionLine")) : null;
        this.parent = inits.isInitialized("parent") ? new QDecisionNode(forProperty("parent"), inits.get("parent")) : null;
        this.user = inits.isInitialized("user") ? new com.back.domain.user.entity.QUser(forProperty("user")) : null;
    }

}

