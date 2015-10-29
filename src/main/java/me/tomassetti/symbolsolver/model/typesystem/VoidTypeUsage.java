package me.tomassetti.symbolsolver.model.typesystem;

import me.tomassetti.symbolsolver.model.Context;
import me.tomassetti.symbolsolver.model.SymbolReference;
import me.tomassetti.symbolsolver.model.TypeSolver;
import me.tomassetti.symbolsolver.model.declarations.MethodDeclaration;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * Created by federico on 21/08/15.
 */
public class VoidTypeUsage implements TypeUsage {
    public static final TypeUsage INSTANCE = new VoidTypeUsage();

    private VoidTypeUsage() {

    }

    @Override
    public String getTypeName() {
        return "void";
    }

    @Override
    public SymbolReference<MethodDeclaration> solveMethod(String name, List<TypeUsage> parameterTypes, TypeSolver typeSolver) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<TypeUsage> parameters() {
        return Collections.emptyList();
    }

    @Override
    public boolean isAssignableBy(TypeUsage other, TypeSolver typeSolver) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getQualifiedName() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String prettyPrint() {
        return "void";
    }
}
