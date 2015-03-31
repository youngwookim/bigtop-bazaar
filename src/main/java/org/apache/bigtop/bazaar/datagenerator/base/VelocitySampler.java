/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.bigtop.bazaar.datagenerator.base;

import java.util.Random;

public class VelocitySampler
{
	Random rng;
	double temperature;
	
	public VelocitySampler(Random rng)
	{
		this.rng = rng;
	}
	
	public Vec2D[] sample(Topology topology)
	{
		double kBT = Constants.BOLTZMANN * topology.getTemperature();
		
		Vec2D[] velocities = new Vec2D[topology.getNumberParticles()];
		for(int i = 0; i < topology.getNumberParticles(); i++)
		{
			double kBTOverM = Math.sqrt(kBT / topology.getParticleMasses()[i]);
			
			velocities[i] = new Vec2D(rng.nextGaussian() * kBTOverM,
					rng.nextGaussian() * kBTOverM);
		}
		
		return velocities;
	}
}