/*
 * Copyright (c) 2002-2016 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.server.security.enterprise.auth;

import org.neo4j.helpers.Service;
import org.neo4j.kernel.api.exceptions.KernelException;
import org.neo4j.kernel.impl.factory.ProceduresProvider;
import org.neo4j.kernel.impl.proc.Procedures;

@Service.Implementation( ProceduresProvider.class )
public class EnterpriseAuthProceduresProvider extends ProceduresProvider
{
    public EnterpriseAuthProceduresProvider()
    {
        super( "enterprise-auth-procedures-provider" );
    }

    @Override
    public void registerProcedures( Procedures procedures ) throws KernelException
    {
        procedures.registerProcedure( AuthProcedures.class, true );
    }
}
