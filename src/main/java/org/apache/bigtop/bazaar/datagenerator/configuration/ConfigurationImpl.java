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
package org.apache.bigtop.bazaar.datagenerator.configuration;

import java.util.Vector;


public class ConfigurationImpl implements Configuration
{
	long steps;
	double timestep;
	double temperature;
	double damping;
	int numberParticles;
	double boundaryRadius;
	double boundaryStrength;
	double particleMass;
	Vector<Booth> booths;
	
	public ConfigurationImpl()
	{
		this.booths = new Vector<Booth>();
	}

	public void setSteps(long steps)
	{
		this.steps = steps;
	}

	public void setTimestep(double timestep)
	{
		this.timestep = timestep;
	}

	public void setTemperature(double temperature)
	{
		this.temperature = temperature;
	}

	public void setDamping(double damping)
	{
		this.damping = damping;
	}

	public void setNumberParticles(int numberParticles)
	{
		this.numberParticles = numberParticles;
	}

	public void setBoundaryRadius(double boundaryRadius)
	{
		this.boundaryRadius = boundaryRadius;
	}

	public void setBoundaryStrength(double boundaryStrength)
	{
		this.boundaryStrength = boundaryStrength;
	}

	public void setParticleMass(double particleMass)
	{
		this.particleMass = particleMass;
	}
	
	public void addBooth(Booth booth)
	{
		this.booths.add(booth);
	}

	/* (non-Javadoc)
	 * @see org.apache.bigtop.bazaar.datagenerator.configuration.Configuration#getNumberParticles()
	 */
	@Override
	public int getNumberParticles()
	{
		return numberParticles;
	}

	/* (non-Javadoc)
	 * @see org.apache.bigtop.bazaar.datagenerator.configuration.Configuration#getSteps()
	 */
	@Override
	public long getSteps()
	{
		return steps;
	}
	
	/* (non-Javadoc)
	 * @see org.apache.bigtop.bazaar.datagenerator.configuration.Configuration#getTimestep()
	 */
	@Override
	public double getTimestep()
	{
		return timestep;
	}
	
	/* (non-Javadoc)
	 * @see org.apache.bigtop.bazaar.datagenerator.configuration.Configuration#getTemperature()
	 */
	@Override
	public double getTemperature()
	{
		return temperature;
	}
	
	/* (non-Javadoc)
	 * @see org.apache.bigtop.bazaar.datagenerator.configuration.Configuration#getDamping()
	 */
	@Override
	public double getDamping()
	{
		return damping;
	}
	
	/* (non-Javadoc)
	 * @see org.apache.bigtop.bazaar.datagenerator.configuration.Configuration#getBoundaryRadius()
	 */
	@Override
	public double getBoundaryRadius()
	{
		return boundaryRadius;
	}
	
	/* (non-Javadoc)
	 * @see org.apache.bigtop.bazaar.datagenerator.configuration.Configuration#getBoundaryStrength()
	 */
	@Override
	public double getBoundaryStrength()
	{
		return boundaryStrength;
	}
	
	/* (non-Javadoc)
	 * @see org.apache.bigtop.bazaar.datagenerator.configuration.Configuration#getParticleMass()
	 */
	@Override
	public double getParticleMass()
	{
		return particleMass;
	}
	
	/* (non-Javadoc)
	 * @see org.apache.bigtop.bazaar.datagenerator.configuration.Configuration#getBooths()
	 */
	@Override
	public Vector<Booth> getBooths()
	{
		return booths;
	}
	
	public String toString()
	{
		String str = "steps: " + steps + "\n" +
				"timestep: " + timestep + "\n" +
				"temperature: " + temperature + "\n" +
				"damping: " + damping + "\n" +
				"particle mass: " + particleMass + "\n" +
				"number of particles: " + numberParticles + "\n" +
				"boundary radius: " + boundaryRadius + "\n" +
				"boundary strength: " + boundaryStrength + "\n" +
				"booths: \n";
		
		if(booths != null)
		{
			for(Booth booth : booths)
			{
				str += "\t " + booth.toString() + "\n";
			}
		}
		
		return str;
	}
}
